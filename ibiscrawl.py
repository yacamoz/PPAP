#마켓 사이즈 안에 있는 모든 링크들을 목록화하여 찾는다
#목록화하여 찾은 링크들을 반복문을 사용하여 마켓사이즈 그래프의 숫자들을 텍스트화 한다.
#해당 자료들을 모조리 저장하고 정리한다.

import requests
from bs4 import BeautifulSoup

url ="https://www.ibisworld.com/global/industry-statistics/market-size/"
res = requests.get(url)
res.raise_for_status()

html = '''
    <link rel="stylesheet" type="text/css" href="/theme/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/theme/css/style.css">

    <div>
       <a class="mode" href="https://pytutorial.com"><p>Converting File Size in Python</p></a>
       <a href="https://ex.com/home"><p>Converting File Size in Python</p></a>
    </div>   
'''

soup = BeautifulSoup(html, 'html.parser')
links = soup.find_all('a')
cell_line=[]
for i in links:
    href = i.attrs['href']
    cell_line.append(href)

print(cell_line)