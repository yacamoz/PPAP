from bs4 import BeautifulSoup
import requests
import csv

filename = "yes24-bookclub-monthly.csv"
f = open(filename, "w", encoding="utf8", newline="")
writer =csv.writer(f)

url = "http://bookclub.yes24.com/BookClub/BcBest?OrderBy=30&FilterBy=&pageNo=1"
res = requests.get(url)
res.raise_for_status()
soup = BeautifulSoup(res.text, 'html.parser')
tags = soup.find_all("a")
print(tags)


