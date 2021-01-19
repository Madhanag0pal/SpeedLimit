n = int(input())
while(n != -1):
    if(1<=n and n<=10):
        tp = m = 0;
        for i in range(n):
            s, tc = input().split();
            s, tc = int(s),int(tc)
            if((1<=s and s<=90) and (1<=tc and tc<=12)):
                m += s * (tc - tp);
                tp = tc;
        print(m, " miles")
    n = int(input())