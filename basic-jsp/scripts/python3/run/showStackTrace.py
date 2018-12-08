#!/usr/local/bin/python3

import json
import requests

r = requests.get('http://localhost:8080/basic-jsp/showStackTrace')
print(r.content.decode('utf-8'))

