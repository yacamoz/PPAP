from bs4 import BeautifulSoup
from selenium.webdriver import Chrome
from selenium.webdriver.chrome.options import Options

url = "https://www.ibisworld.com/global/industry-statistics/market-size/"
driver = webdriver.chrome()
chrome_options = Options()  
chrome_options.add_argument("--headless") # Opens the browser up in background

with Chrome(options=chrome_options) as browser:
     browser.get(url)
     html = browser.page_source

page_soup = BeautifulSoup(html, 'html.parser')
containers = page_soup.findAll("div",{"a":"href"})