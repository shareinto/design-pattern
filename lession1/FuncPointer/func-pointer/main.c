#include <stdlib.h>
#include "sort.h"
#include "desc.h"
#include <stdio.h>

void display(int *,int len);
extern int (*comparer)(int,int);

int main(void)
{
  comparer = desc;
  int array[10] = {5,8,3,9,1,7,4,2,0,6};
  int len = 10;
  sort(array,len);
  display(array,len);
  exit(0);
}

void display(int *array,int len)
{
  printf("[");
  for(int i=0;i < len;i ++)
  {
    if(i == len - 1)
    {
      printf("%d",array[i]);
    }
    else
    {
      printf("%d,",array[i]);
    }
  }
  printf("]\n");
}


