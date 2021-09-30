#마켓 사이즈 안에 있는 모든 링크들을 목록화하여 찾는다
#목록화하여 찾은 링크들을 반복문을 사용하여 마켓사이즈 그래프의 숫자들을 텍스트화 한다.
#해당 자료들을 모조리 저장하고 정리한다.

from urllib.request import Request, urlopen
from bs4 import BeautifulSoup

url ="https://www.ibisworld.com/global/industry-statistics/market-size/"
res = urlopen(url)
res.raise_for_status()

soup = BeautifulSoup(res.text, 'lxml')
links = soup.find_all('a')
cell_line=[]
for i in links:
    href = i.attrs['href']
    cell_line.append(href)

print(cell_line)