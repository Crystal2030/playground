#!/usr/local/bin/python3

# 用 data.txt 中的数据生成 insert 语句, 并写入 insert.sql

import re

fin = open('data.txt')
fout = open('insert.sql', 'w')
fout.write('''INSERT INTO
Population (`rank`, `country`, `population`)
VALUES
''')
value = []

for line in fin:
    if line.startswith('#'):
        continue
    line = line.strip()
    info = line.split('\t')

    rank = int(info[0])
    # 原始文件中的 country 名称前有图片, 复制到文件中就变为空格了, 需要调用 strip() 特殊处理一下
    country = info[1].strip()
    population = info[2].replace(',', '')

    # print(country, population)
    value.append(('(%s, "%s", %s)' % (rank, country, population)))
fout.write(',\n'.join(value))
fout.write(';')
fin.close()
fout.close()
