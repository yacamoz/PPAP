
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


brower = webdriver.Chrome('C:\pythonnori\PPAP\python\chromedriver.exe')

url="https://www.ibisworld.com/global/market-size/global-accounting-services/"
brower.get(url)
idx=1
try:
    elem = WebDriverWait(brower, 10).until(EC.presence_of_all_elements_located((By.XPATH, '//*[@id="Statistics_MarketSize_Chart_Div"]/div/div[1]/div/div/table')))
    
    elem = brower.find_elements_by_tag_name('td')
    for e in elem:
        data = e.text
        print(data)
        print(idx)
        idx+=1

finally:
    brower.quit()
