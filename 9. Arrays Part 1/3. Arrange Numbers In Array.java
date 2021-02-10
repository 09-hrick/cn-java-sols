from sys import stdin

def arrange(arr, n) :
    #Your code goes here
    if n!=0:
        if n%2==0:
            i=1
            j=0
            while j<=n/2:
                arr[j]=i
                i+=2
                j+=1
            k=2
            q=-1
            while q >= -n/2:
                arr[q]=k
                k+=2
                q-=1       

        else:
            i=1
            j=0
            while j<=(n-1)/2:
                arr[j]=i
                i+=2
                j+=1
            k=2
            q=-1
            while q >= (1-n)/2:
                arr[q]=k
                k+=2
                q-=1   

    return arr
        














#to print the array/list
def printList(arr, n) :
    for i in range(n) :
        print(arr[i], end = ' ')
    print()



#main
t = int(stdin.readline().strip())

while t > 0 :
    n = int(stdin.readline().strip())
    arr = n * [0]
    arrange(arr, n)
    printList(arr, n)
    t -= 1