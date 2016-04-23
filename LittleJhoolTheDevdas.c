#include <stdio.h>
int main()
{
     int t;
     char *s;
     int hash[26];
     int i;
     int count;
     s=(char*)malloc(sizeof(char)*1000000);
     scanf("%d",&t);
     while(t--)
     {
          scanf("%s",s);
          i=0;
          count=0;
          memset(hash,0,sizeof(hash));
          while(*(s+i))
          {
               hash[*(s+i)-'a']++;
               if(hash['r'-'a'] && hash['u'-'a'] && hash['b'-'a'] && hash['y'-'a'])
               {
                    count++;
                    hash['r'-'a']--;hash['u'-'a']--;hash['b'-'a']--;hash['y'-'a']--;
               }
               i++;
          }
          if (count==0) printf("%s\n",":(");
          else printf("%d\n",count);
     }
     return 0;
}
