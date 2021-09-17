from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("https://www.ibisworld.com/global/industry-statistics/market-size/")

bsObject = BeautifulSoup(html, "html.parser")

for link in bsObject.find_all('')