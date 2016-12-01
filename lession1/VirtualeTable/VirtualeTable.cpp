// VirtualeTable.cpp : �������̨Ӧ�ó������ڵ㡣
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
	cout << "����ĵ�ַ��" << (&b) << endl;
	cout << "�麯�����ַ��" << (int*)*((int*)(&b)) << endl;
	cout << "�麯���� �� ��һ��������ַ��" << (int*)*(int*)*(int*)(&b) << endl;

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
	cout << "����ĵ�ַ��" << (&d) << endl;
	cout << "�麯�����ַ��" << (int*)*((int*)(&d)) << endl;
	cout << "�麯���� �� ��һ��������ַ��" << (int*)*(int*)*(int*)(&d) << endl;
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



