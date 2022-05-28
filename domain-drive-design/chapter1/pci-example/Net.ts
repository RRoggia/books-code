import Pin from './Pin.ts'

class Net {
  _pins: Array<Pin>
  _name: String

  constructor( name: String, pins: Array<Pin> ){
    this._pins = pins
    this._name = name
  }

  get name(){
    return this._name
  }
  
  signal( numberOfHops: number ) {
    const increasedNumberOfHops: number = numberOfHops + 1  
    for ( let pin of this._pins) {
      pin.signal( increasedNumberOfHops )
    }
  }
}

export default Net