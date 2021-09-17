#pragma warning(disable:4996)
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void SelectionSort(int arr[], int n);
int judge(int arr[])
{
    int i = 0, sum = 0;
    int judarr[6] = { 0 };
    for (i = 0; i < 6; i++)
    {
        if (arr[i] < 6 && arr[i]>0)
            judarr[i] = 9;
        else if (arr[i] < 11 && arr[i]>5)
            judarr[i] = 10;
        else if (arr[i] < 16 && arr[i]>10)
            judarr[i] = 4;
        else if (arr[i] < 21 && arr[i]>15)
            judarr[i] = 2;
        else if (arr[i] < 26 && arr[i]>20)
            judarr[i] = 9;
        else if (arr[i] < 31 && arr[i]>25)
            judarr[i] = 3;
        else if (arr[i] < 36 && arr[i]>30)
            judarr[i] = 2;
        else if (arr[i] < 41 && arr[i]>35)
            judarr[i] = 11;
        else if (arr[i] < 46 && arr[i]>40)
            judarr[i] = 1;
    }

    for (i = 0; i < 6; i++)
    {
        sum += judarr[i];
    }
    // 추가 점수
    int arr2[9] = { 13,15,19,20,27,30,34,38,43 };
    for (int i = 0; i < 6; i++)
    {
        for (int j = 0; j < 8; j++)
            if (arr[i] == arr2[j])
            {
                sum += 1;
                break;
            }
    }
    return sum;
}
int main()

{
        int  lotto[6] = { 0 };   // 나머지 5개에는 0으로 채움 --> 6개 모두 0으로 초기화 된다.
        int i = 0, n = 0,  a=0;
            n = 0;
            srand((unsigned)time(NULL));  // 매번 다른 수를 생성하도록 랜덤함수 초기화
            printf("몇 개의 조합을 생성하실 건가요?:");
            scanf("%d", &a);
            for (int y = 0; y < a; y++) //난수 반복 횟수
            {
                n = 0;

                while (1)   // 중복수가 존재하기 때문에  for 문으로  6번 반복하면 안됨

                {
                    int r = rand() % 45 + 1;  // 1~45 사이의 랜덤 수 생성, 중복 가능

                    for (i = 0; i < n; i++)         // 이미 생성된 개수 만큼만 중복된 수인지 검사한다.
                        if (lotto[i] == r) break;     // 이미 생성된 번호인지(중복수) 검사한다.

                    if (n == i) lotto[n++] = r;            // 중복수가 아닐때에만 n위치에 생성된 수를 기억시킨다.
                    if (n >= 6) break;        // 랜덤 수 6개가 생성되었으면 무한 반복을 벗어난다.
                }


                // 크기순
                SelectionSort(lotto, 6);

                // 출력
                for (i = 0; i < 6; i++)
                {
                    printf("%d ", lotto[i]);
                }
                printf("\n");

                printf("이 조합의 점수는: %d점\n", judge(lotto));
            }
    return 0;

}
void SelectionSort(int arr[], int n)

{
    int i, k, p, temp;

    for (i = 0; i < n - 1; i++) {
        p = i;
        for (k = i + 1; k < n; k++) {

            if (arr[k] < arr[p]) p = k; // 오름차순 정렬

        }
        temp = arr[i];
        arr[i] = arr[p];
        arr[p] = temp;
    }
}