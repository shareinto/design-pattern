// CExpand.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>

using namespace std;

class Rect
{
public:
	int x;
	int y;
	Rect(int x, int y)
	{
		this->x = x;
		this->y = y;
	}
	int getArea()
	{
		return this->x*this->y;
	}
};

struct StructRect
{
	int x;
	int y;
};

void StructRect(struct StructRect* rect, int x, int y)
{
	rect->x = x;
	rect->y = y;
}

int getArea(struct StructRect* rect)
{
	return rect->x * rect->y;
}

int main()
{
	Rect *rect = &Rect(10, 20);

	struct StructRect structRect;
	StructRect(&structRect, 10, 20);

	cout << "area is " << rect->getArea() << endl;
	cout << "area is " << getArea(&structRect) << endl;
    return 0;
}

