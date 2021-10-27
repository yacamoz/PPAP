import requests
import csv
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from bs4 import BeautifulSoup
from selenium.webdriver.chrome.options import Options
from pathos.multiprocessing import ProcessingPool as Pool
import time
import random
import threading

count = 3

# options = webdriver.ChromeOptions()
# options.add_argument('headless')
# options.add_argument('window-size=1920x1080')
# options.add_argument("disable-gpu")
# browser = webdriver.Chrome('C:\pythonnori\PPAP\python\chromedriver.exe', chrome_options=options)
def viewsite(browser):
    while(True):
        browser.get("https://www.youtube.com/watch?v=R4P7BSFH_oE")
        time.sleep(random.randint(5, 10))

for i in range(count):
    browserThread = threading.Thread(target=viewsite, args=(webdriver.Chrome('C:\pythonnori\PPAP\python\chromedriver.exe')))
    browserThread.start()