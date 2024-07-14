def Func(*args):
    for a in args:
        print(a)
Func([1,2,3,4,'ogs','maw','waw','hehe'])

def double_val(x, *args):
    for a in args:
        print(x * a)
double_val(2,2,3,4,5,6)

def Func(x = 5, y = 1):
    print(f"{x} {y}")
Func()
Func(3)
Func(3,4)

def Func(**kwargs):
    for item in kwargs.items():
        print(item)
    print(kwargs)
Func(x=12, y=13)

def Func(*args, **kwargs):
    print(args)
    print(kwargs)
Func(1,2,3,x=12, y=13)

def Func(a,b,*args,k='default kwarg', **kwargs):
    print(a)
    print(b)
    print(k)
    print(args)
    print(kwargs)
Func('argument','default',1,2,3,k='def kwarg', x=12, y=13)


