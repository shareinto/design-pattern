var ColorFactory = (function(){
    var maps = {};
    var factory = 
    {
        getColor:function(key){
            if(!maps[key]){
                    maps[key] = new Color(key); 
            }
            return maps[key];
        }  
    };
    return factory;
})();