double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
			//Scale lets you increas or decrease the sise by a scale factor
CSG cubeSmall = cube
				.scalex(0.5)
				.scaley(0.5)
				.scalez(0.5)
				.movey(size*1.5)
			
// this can be a shell or printer keepaway
// this increases the size by a spacific measurment in mm
CSG cubeBigger = cube
				.makeKeepaway((double)10.0)
				.movex(size*1.5)
				
return [cube,cubeBigger, cubeSmaller ]