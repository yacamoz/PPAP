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
    // �߰� ����
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
        int  lotto[6] = { 0 };   // ������ 5������ 0���� ä�� --> 6�� ��� 0���� �ʱ�ȭ �ȴ�.
        int i = 0, n = 0,  a=0;
            n = 0;
            srand((unsigned)time(NULL));  // �Ź� �ٸ� ���� �����ϵ��� �����Լ� �ʱ�ȭ
            printf("�� ���� ������ �����Ͻ� �ǰ���?:");
            scanf("%d", &a);
            for (int y = 0; y < a; y++) //���� �ݺ� Ƚ��
            {
                n = 0;

                while (1)   // �ߺ����� �����ϱ� ������  for ������  6�� �ݺ��ϸ� �ȵ�

                {
                    int r = rand() % 45 + 1;  // 1~45 ������ ���� �� ����, �ߺ� ����

                    for (i = 0; i < n; i++)         // �̹� ������ ���� ��ŭ�� �ߺ��� ������ �˻��Ѵ�.
                        if (lotto[i] == r) break;     // �̹� ������ ��ȣ����(�ߺ���) �˻��Ѵ�.

                    if (n == i) lotto[n++] = r;            // �ߺ����� �ƴҶ����� n��ġ�� ������ ���� ����Ų��.
                    if (n >= 6) break;        // ���� �� 6���� �����Ǿ����� ���� �ݺ��� �����.
                }


                // ũ���
                SelectionSort(lotto, 6);

                // ���
                for (i = 0; i < 6; i++)
                {
                    printf("%d ", lotto[i]);
                }
                printf("\n");

                printf("�� ������ ������: %d��\n", judge(lotto));
            }
    return 0;

}
void SelectionSort(int arr[], int n)

{
    int i, k, p, temp;

    for (i = 0; i < n - 1; i++) {
        p = i;
        for (k = i + 1; k < n; k++) {

            if (arr[k] < arr[p]) p = k; // �������� ����

        }
        temp = arr[i];
        arr[i] = arr[p];
        arr[p] = temp;
    }
}