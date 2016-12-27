function Color(color){
    this.color = color;
    this.draw = function(view){
        console.log("color is " + this.color);
        view.draw();
    }
}
