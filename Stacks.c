#include<stdio.h>
#include<stdlib.h>
struct Stack{
    int size;
    int top;
    int *S;
};

void create(struct  Stack *st)
{
    //create a stk using dynamic memory allocation
    printf("Enter the size of the stack:");
    scanf("%d",&st->size);
    st -> top=-1; //top points to the first element
    st -> S =(int*)malloc(st->size*sizeof(int));

}
void Display(struct Stack st)
{
    int i;
    for(i = top;i>=0;i--)
    {
        printf("%d",st.S[i]);
        printf("\n");
    }  
}
void push(struct Stack *st,int x)
{
    if(st->top == st->size-1)
    {
        printf("Stack overflow:");
    }
    else
    {
        st -> top++;
        st -> S[st->top] = x;
    }
    
}
int pop(struct Stack *st)
{
    int x=-1;
    if(st->top ==-1)
    print("Underflow");
    else
    {
        x = st->S[st->top--];
    }
    
}
int main()
{
    struct Stack st;
    create(&st);

    push(&st,10);
    push(&st,20);
    push(&st,30);
    Display(st);
    return 0;

}
