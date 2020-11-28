
function extremos(x){
    max = 0;
    min = x[0];
    for(var i=0; i<x.length; i++){
        if (max<x[i]){
            max=x[i]
        }
        if (min>x[i]){
            min=x[i]
        }
     }
        return(max+min)   
 }
console.log(extremos([]));
   
    
describe("extremos", function() { 
    it("Retorna 14 cuando los argumentos son [8,7,3,5,10,11]", function() { 
        expect(extremos([8,7,3,5,10,11])).toEqual(14); 
    }); 
    it("Retorna 12 cuando los argumentos son [8,7,3,1,10,11]", function() { 
        expect(extremos([8,7,3,1,10,11])).toEqual(12); 
    }); 
    it("Retorna 7 cuando los argumentos son [-3,7,3,5,10]", function() { 
        expect(extremos([-3,7,3,5,10])).toEqual(7); 
    });
    it("Retorna 5 cuando los argumentos son [1,2,3,-4,9]", function() { 
        expect(extremos([1,2,3,-4,9])).toEqual(5); 
    });
});