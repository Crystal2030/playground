#!/usr/local/bin/python3

import os
import requests

r = requests.get('http://localhost:8080/basic-servlet/simpleHttp')
print(r.content.decode('utf-8'))

