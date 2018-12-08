#!/usr/local/bin/python3

import json
import requests

headers = {
    "JustATest": "Some random stuff",
    "FakeKey": "FakeValue"
}
r = requests.get('http://localhost:8080/basic-jsp/showHeader', headers=headers)
print(r.content.decode('utf-8'))

