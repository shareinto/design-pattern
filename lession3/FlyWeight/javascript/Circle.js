function Circle(radius){
    this.radius = radius;
    this.draw = function () {
        console.log("draw circle: radius is " + this.radius);
    };
}