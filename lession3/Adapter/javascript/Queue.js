function Queue(){
    var array = [];
    this.enqueue = function(item){
        array.push(item);
    }
    this.dequeue = function(){
        if(array.length > 0){
            return array.pop();
        }
        return null;
    }
    this.peek = function(){
        if(array.length > 0){
            return array[array.length - 1];
        }
        return null;
    }
}