// VirtualCallVsStaticCall.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <time.h>
#include <iostream>

using namespace std;

class Base
{
private:
	volatile int tick;
public:
	virtual void increase()
	{
		tick++;
	}
};

class Derive : public Base
{
private:
	volatile int tick;
public:
	virtual void increase()
	{
		tick++;
	}
};

class Alone
{
private:
	volatile int tick;
public:
	void increase()
	{
		tick++;
	}
};

clock_t dispatch(int i)
{
	clock_t  clockBegin, clockEnd;
	clockBegin = clock();
	Derive d;
	Derive*b = &d;
	while (i-- > 0)
	{
		b->increase();
	}
	clockEnd = clock();
	return clockEnd - clockBegin;
}

clock_t noneDispatch(int i)
{
	clock_t  clockBegin, clockEnd;
	clockBegin = clock();
	Alone a;
	Alone*pa = &a;
	while (i-- > 0)
	{
		pa->increase();
	}
	clockEnd = clock();
	return clockEnd - clockBegin;
}


int main()
{
	int count = 100000000;
	while (true)
	{
		cout << "dispatch: " << dispatch(count) << endl;
		cout << "non-dispatch: " << noneDispatch(count) << endl;
	}
	return 0;
}

