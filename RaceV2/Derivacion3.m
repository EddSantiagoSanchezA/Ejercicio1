
% Derivación numérica de funciones
% Dada una funcion, un punto a evaluar y un ¨h¨, encontrar la 
% derivación recursiva, progresiva y de diferencia central
% Ricardo López
% Eddy Sánchez

clc
syms f(x);
disp('Derivación numérica de funciones')
f(x) = input('Funcion en x: ');
c = input('Punto a evaluar: ');
h = input('h: ');

dif = diff(f,x); %derivada en x
dif2 = diff(f,x,2);
valor_exacto = subs(dif,c); % derivada evaluada en c (exacta)

disp('Calculo 1era derivada f(x)')

% derivación recursiva

dr = (f(c)-f(c-h))/h;

% derivación progresiva

dp = (f(c+h)-f(c))/h;

% derivación por diferencia central

ddc = (f(c+h)-f(c-h))/(2*h);

% 2da derivada

valor_exacto_2da = subs(dif2,c); % derivada evaluada en c (exacta)

dr2=(f(c)-2*f(c-h)+f(c-2*h))/(h*h);

dp2=(f(c+2*h)-2*f(c+h)+f(c))/(h*h);

ddc2=(f(c+2*h)-2*f(c)+f(c-2*h))/(4*h*h);



%fprintf ('h: ');
%disp(h)
fprintf ('\nRecursiva: ');
disp (vpa(dr))
fprintf ('Progresiva: ');
disp (vpa(dp))
fprintf ('Diferencia central: ');
disp (vpa(ddc))
fprintf ('Exacta: ');
disp (vpa(valor_exacto))


disp('Calculo 2da derivada f(x)')
fprintf ('\n2da derivada Recursiva: ');
disp (vpa(dr2))
fprintf ('2da derivada Progresiva: ');
disp (vpa(dp2))
fprintf ('2da derivada Diferencia central: ');
disp (vpa(ddc2))
fprintf ('2da derivada Exacta: ');
disp (vpa(valor_exacto_2da))


fprintf('** Fin Derivacion **\n');