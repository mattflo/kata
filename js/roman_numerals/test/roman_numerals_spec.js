var chai = require('chai');
chai.should();

var romanDigitToInt = function (romanDigitToInt) {
  if (romanDigitToInt == 'i') {
    return 1;
  } else if (romanDigitToInt == 'v'){
    return 5;
  } else {
    return 10;
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
  });
});

