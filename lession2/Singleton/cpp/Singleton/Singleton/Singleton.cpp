// Singleton.cpp : �������̨Ӧ�ó������ڵ㡣
//

#include "stdafx.h"
#include <iostream>

using namespace std;

template<class T> class Singleton
{
public:
	static T& Instance()
	{
		static T instance; //����T��һ��protectedĬ�Ϲ��캯��
		return instance;
	}
};

class Color
{
	friend class Singleton<Color>;
	int color;

public:
	int getColor() const 
	{ 
		return color; 
	}
	void setColor(int color) 
	{
		this->color = color;
	}
private:
	Color() 
	{
		this->color = 0;
	}
	Color(Color& color) 
	{
		this->color = color.color;
	}
};

int main()
{
	Singleton<Color>::Instance().setColor(50);
	cout << Singleton<Color>::Instance().getColor() << endl;
	int a = 0;
	cin >> a;
    return 0;
}

