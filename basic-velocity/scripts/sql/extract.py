#!/usr/local/bin/python3

fin = open('insert.sql')
fout = open('data.txt', 'w')
for line in fin:
    if "'" not in line:
        continue
    line = line.strip()
    lp = line.find('(')
    rp = line.find(')')
    raw_name, raw_age = line[(lp+1):rp].split(',')
    name = raw_name.replace("'", '')
    age = raw_age.strip()
    fout.write('%s %s\n' % (name, age))
fin.close()
fout.close()

