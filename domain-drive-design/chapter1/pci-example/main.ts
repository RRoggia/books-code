import Pin from './Pin.ts'
import Net from './Net.ts'
import ComponentInstance from './ComponentInstance.ts'

const pinB1 = new Pin( 'B1' )
const pinC2 = new Pin( 'C1' )
const netX = new Net( 'X', [ pinB1, pinC2] )
const pinA1 = Pin.createWithNet( 'A1', netX )

const pinD1 = new Pin( 'D1' )
const netY = new Net( 'y', [ pinD1 ] )
const pinB2 = Pin.createWithNet( 'B2', netY )
const pinB3 = new Pin( 'B3' )
const pinB4 = new Pin('B4' )

const componentInstanceA = new ComponentInstance( 'a', [ pinA1 ] )
const componentInstanceB = new ComponentInstance( 'b', [ pinB1, pinB2, pinB3, pinB4 ] )
const componentInstanceC = new ComponentInstance( 'c', [ pinC2 ] )
const componentInstanceD = new ComponentInstance( 'd', [ pinD1 ] )

console.log( componentInstanceA.signal( 0 ) )