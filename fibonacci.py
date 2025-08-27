
def fibonacci(n):
    a, b = 0, 1
    if n >= 0:
        print(a, end=" ")
    if n >= 1:
        print(b, end=" ")

    
    for _ in range(2, n + 1):
        c = a + b
        print(c, end=" ")
        a = b
        b = c


fibonacci(10)