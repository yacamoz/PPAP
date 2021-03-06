import csv
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
brower = webdriver.Chrome('C:\pythonnori\PPAP\python\chromedriver.exe')

url="https://www.ibisworld.com/united-states/industry-statistics/market-size/"
brower.get(url)

filename = "IBIS-United-States-market.csv"
f = open(filename, "w", encoding="utf-8-sig", newline="")
writer = csv.writer(f)

try:
    elem = WebDriverWait(brower, 10).until(EC.presence_of_all_elements_located((By.XPATH, '//*[@id="SpecializedReportsList"]/div[9]/div[3]/div[47]/a/span')))
    
    elem = brower.find_elements_by_tag_name("a")
    for e in elem:
        if "-united-states/" in e.get_attribute("href"):
            data = e.get_attribute("href")
            writer.writerow(data)
        else:
            continue 
finally:
    brower.quit()


