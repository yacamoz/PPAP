from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.common.exceptions import TimeoutException
from bs4 import BeautifulSoup
from urllib.request import Request, urlopen



browser = webdriver.Chrome('C:\pythonnori\PPAP\python\chromedriver.exe')
browser.get("https://www.ibisworld.com/global/industry-statistics/market-size/")
try:
    element = WebDriverWait(browser, 10).until(
         EC.presence_of_element_located((By.TAG_NAME, "span"))
    )
    soup = BeautifulSoup(browser.get, 'html.parser')
    for anchor in soup.find_all('a'):
     print(anchor.get('href'))
finally:
     browser.quit()
    