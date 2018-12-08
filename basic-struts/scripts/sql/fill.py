#!/usr/local/bin/python3

# 用 data.txt 中的数据生成 insert 语句, 并写入 insert.sql

import re

fin = open('data.txt')
fout = open('insert.sql', 'w')
fout.write('''INSERT INTO 
Person (`name`, `age`)
VALUES
''')
value = []

for line in fin:
    if line.startswith('#'):
        continue
    line = line.strip()
    name, age = line.split()

    value.append(('("%s", %s)' % (name, age)))
fout.write(',\n'.join(value))
fout.write(';')
fin.close()
fout.close()
