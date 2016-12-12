#include "sort.h"
#include <stdlib.h>

extern int (*comparer)(int,int);

void sort(int *array,int len)
{
  int i,j;
  for(i = 0;i<len;i++)
  {
    for(j = len - 1;j > i;j --)
    {
      int a = array[j];
      int b = array[j - 1];
      int result = 0;
      /* comparer */
      if(comparer != NULL)
      {
        result = comparer(a,b);
      }
      else
      {
        result = a - b;
      }

      if(result < 0)
      {
        array[j] = array[j] + array[j - 1];
        array[j - 1] = array[j] - array[j - 1];
        array[j] = array[j] - array[j - 1];
      }
    }
  }
}
