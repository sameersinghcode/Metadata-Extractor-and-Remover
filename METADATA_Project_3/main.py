import os
import sys
from PIL import Image

image_abs_path = sys.argv[1]

if not os.path.exists(image_abs_path):
    print("Image doesn't exist!")


image = Image.open(image_abs_path)

# next 3 lines strip exif
data = list(image.getdata())
image_without_exif = Image.new(image.mode, image.size)
image_without_exif.putdata(data)

#os.remove(image_abs_path)

#image_without_exif.save(image_abs_path)
image_without_exif.save("Without_Exif.jpg")
print("Successfully overwritten file!")