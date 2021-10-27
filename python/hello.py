urllink = open("IBIS-global-market.csv", "r", encoding="utf8")
while True:
    line = urllink.readline()
    if not line:
        break
    print(line, end="")
urllink.close()