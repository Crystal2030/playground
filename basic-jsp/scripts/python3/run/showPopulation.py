#!/usr/local/bin/python3

import json
import requests

r = requests.get('http://localhost:8080/basic-jsp/showPopulation')
print(r.content.decode('utf-8'))

