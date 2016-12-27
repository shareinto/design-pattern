function Rectangle(x,y){
    this.x = x;
    this.y = y;
    this.draw = function () {
        console.log("draw rectangle: x is " + this.x + ",y is " + this.y);
    };
}