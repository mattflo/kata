var chai = require('chai');
chai.should();

var romanDigitToInt = function (digit) {
  if (digit == 'i') {
    return 1;
  } else if (digit == 'v'){
    return 5;
  } else if (digit == 'x'){
    return 10;
  } else if (digit == 'l'){
    return 50;
  } else {
    return 100;
  };
};

describe('converting roman numerals to integers',function(){
  describe('digits', function(){
    it('should interpret i', function(){
      romanDigitToInt('i').should.equal(1);
    });
    it('should interpret v', function(){
      romanDigitToInt('v').should.equal(5);
    });
    it('should interpret x', function(){
      romanDigitToInt('x').should.equal(10);
    });
    it('should interpret l', function(){
      romanDigitToInt('l').should.equal(50);
    });
    it('should interpret c', function(){
      romanDigitToInt('c').should.equal(100);
    });
  });
});

