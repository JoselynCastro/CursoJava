//Devuelve la suma de 1 a N. Por ejemplo,  Sum1toN(3) devolverá la suma de 1+2+3, la cual es 6
//sum1toN(255) devuelve la suma de todos los números de 1 a 255
function Sum1toN(n){
    var suma=0;
    for(var i=1; i<=n; i++){
        suma=suma+i;
    }
    return suma;
}
console.log(Sum1toN());

//devuelve la suma del primer y último número en el array
//function sumFirstLast(arr){
function sumFirstLast(array){
    var sum=0;
    for(var i=0;i<array.length;i++){
        if(i==0){
           sum=sum+array[i]
        } 
        if(i==array.length-1){
            sum=sum+array[i]
        }
         
    }
    return sum
}
console.log(sumFirstLast([]));
    
describe("Sum1toN", function() { 
    it("should return 3 when we pass 2 as an argument", function() { 
        expect(Sum1toN(2)).toEqual(3); 
    }); 
    it("should return 6 when we pass 3 as an argument", function() { 
        expect(Sum1toN(3)).toEqual(6); 
    }); 
    it("should return 10 when we pass 4 as an argument", function() { 
        expect(Sum1toN(4)).toEqual(10); 
    });
    it("retorna 15 cuando el argumento sea 5", function() { 
        expect(Sum1toN(5)).toEqual(15); 
    });
    it("retorna 21 cuando el argumento sea 6", function() { 
        expect(Sum1toN(5)).toEqual(15); 
    }); 
});
    
describe("sumFirstLast", function() { 
    it("should return 3 when we pass [1,2] as an argument", function() { 
        expect(sumFirstLast([1,2])).toEqual(3); 
    }); 
    it("should return 10 when we pass [2,3,8] as an argument", function() { 
        expect(sumFirstLast([2,3,8])).toEqual(10); 
    }); 
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function() { 
        expect(sumFirstLast([-6,23,3,-4])).toEqual(-10); 
    });
    it("should return 13 when we pass [6,23,3,7] as an argument", function() { 
        expect(sumFirstLast([6,23,3,7])).toEqual(13); 
    });  
    it("should return 20 when we pass [11,2,3,9] as an argument", function() { 
        expect(sumFirstLast([11,2,3,9])).toEqual(20); 
    }); 
});