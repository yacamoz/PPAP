from bs4 import BeautifulSoup
from selenium import webdriver


url = "https://www.ibisworld.com/global/industry-statistics/market-size/"
soup = BeautifulSoup(html, 'lxml')

for mokrok in soup.find_all('a'):
    print(mokrok.get('href'))