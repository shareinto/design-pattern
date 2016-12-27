function ToolBar() {
    var map = {};
    this.registView = function (id,view) {
        map[id] = view;
    };
    this.removeView = function (id) {
        delete map[id];
    };
    this.getView = function (id) {
        if(!map[id]){
            console.error("view " + id +" has not been regist");
        }
        return Object.create(map[id]);
    };
}