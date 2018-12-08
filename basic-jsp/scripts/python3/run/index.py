#!/usr/local/bin/python3

import requests

r = requests.get('http://localhost:8080/basic-jsp/index')
print(r.content.decode('utf-8'))

