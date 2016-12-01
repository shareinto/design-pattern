// VirtualeTable.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>

using namespace std;

typedef void(*Fun)(void);

class Base {
public:
	virtual void f() { cout << "Base::f" << endl; }
	virtual void g() { cout << "Base::g" << endl; }
	virtual void h() { cout << "Base::h" << endl; }
};
class Derive : public Base {
public:
	virtual void f1() { cout << "Derive::f" << endl; }
	virtual void g1() { cout << "Derive::g1" << endl; }
	virtual void h1() { cout << "Derive::g1" << endl; }
};

void CallBase()
{
	Base b;
	Fun pFun = NULL;
	cout << "对象的地址：" << (&b) << endl;
	cout << "虚函数表地址：" << (int*)*((int*)(&b)) << endl;
	cout << "虚函数表 — 第一个函数地址：" << (int*)*(int*)*(int*)(&b) << endl;

	pFun = (Fun)*((int*)*(int*)(&b));
	pFun();
	pFun = (Fun)*((int*)*(int*)(&b) + 1);
	pFun();
	pFun = (Fun)*((int*)*(int*)(&b) + 2);
	pFun();
}
void CallDerive()
{
	Derive d;
	Fun pFun = NULL;
	cout << "对象的地址：" << (&d) << endl;
	cout << "虚函数表地址：" << (int*)*((int*)(&d)) << endl;
	cout << "虚函数表 — 第一个函数地址：" << (int*)*(int*)*(int*)(&d) << endl;
	pFun = (Fun)*((int*)*(int*)(&d));
	pFun();
	pFun = (Fun)*((int*)*(int*)(&d) + 1);
	pFun();
	pFun = (Fun)*((int*)*(int*)(&d) + 2);
	pFun();
	pFun = (Fun)*((int*)*(int*)(&d) + 3);
	pFun();
	pFun = (Fun)*((int*)*(int*)(&d) + 4);
	pFun();
	pFun = (Fun)*((int*)*(int*)(&d) + 5);
	pFun();
}

int main()
{
	CallBase();
	CallDerive();
    return 0;
}



