from requests import Request, Session
from requests.exceptions import ConnectionError, Timeout, TooManyRedirects
import json
import sys
from datetime import datetime

url = 'https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest'
parameters = {
  'start':'1',
  'limit':'10',
  'sort' : 'volume_24h',
  'sort_dir' : 'desc',
}
headers = {
  'accept': 'application/json',
  'X-CMC_PRO_API_KEY': '492a9e67-2061-4b32-bf22-6d9d390b6739',
}

session = Session()
session.headers.update(headers)

try:
  response = session.get(url, params=parameters)
  data = json.loads(response.text)
  print(data)
except (ConnectionError, Timeout, TooManyRedirects) as e:
  print(e)

time = response.elapsed.total_seconds()
print(f'Время получения ответа = {time}')

a = sys.getsizeof(response.text)
print(f'Размер пакета данных = {a}')

if (time <= 500 and a <= 10000 ) or data['data'][0]['updated_date'] == datetime.now():
    print('PASS')
else : print('Fail')
