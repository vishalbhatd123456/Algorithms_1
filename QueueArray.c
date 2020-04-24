#include<stdio.h>
#include<stdlib.h>

struct Queue
{
    int size;
    int rear;
    int front;
    int *Q; //reference for the dynamic memory allocation
};

void create(struct Queue *q,int size)
{
    //initailize a queue
    q->size= size;
    q->front = q->rear = -1;
    q->Q = (int *)malloc(q->size*sizeof(int));

}

void enqueue(struct Queue *q,int x)
{
    if(q->rear == q->size-1)
    {
        printf("the queue is empty\n");
    }
    else
    {
        ++q->rear;
        q->Q[q->rear] = x; //insert at the specified location
    }
    
}

int dequue(struct Queue *q)
{
    int x = -1;
    if(q->front == q->rear)
    {
        printf("the queue is empty cannot delete from the queue\n");
    }
    else
    {
        q->front++;
        x = q->Q[q->front];
    }
    return x;
    
}

void display(struct Queue q)
{
    int i;
    printf("THE ARRAY ELEMENTS:\n");
    for(i=q.front+1 ;i<=q.rear;i++)
    {
        printf("%d   ",q.Q[i]);
        printf("\n");
    }
}




int main()
{
    struct Queue q;
    create(&q, 5);

    enqueue(&q,10);
    enqueue(&q,20);
    enqueue(&q,30);
    enqueue(&q,40);

    dequue(&q);
    dequue(&q);
    dequue(&q);
    dequue(&q);
    dequue(&q);

    display(q);

}
