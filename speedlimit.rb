n = gets.to_i
while(n != -1)
    if(1<=n and n<=10)
        tp = m = 0;
        for i in 1..n
            s, tc = gets.split.map(&:to_i)
            if((1<=s and s<=90) and (1<=tc and tc<=12))
                m += s * (tc - tp)
                tp = tc;
            end
        end
        print(m, " miles\n")
    end
    n = gets.to_i
end