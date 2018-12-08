#!/usr/local/bin/python3

import os
import requests

# rawfilename is something like xx.py
rawfilename = os.path.basename(__file__)

## filename is something like xx
filename, extension = os.path.splitext(rawfilename)

r = requests.get('http://localhost:8080/basic-servlet/%s' % filename)
print(r.content.decode('utf-8'))

