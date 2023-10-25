from PIL import Image
import pathlib
maxsize = (312, 312)

# Set "Input" to the path of the input directory of all your images
for input_img_path in pathlib.Path("input").iterdir():
    # Set output to the path where you want the new resized images should be stored
    output_img_path = str(input_img_path).replace("input","output")
    with Image.open(input_img_path) as im:
        im.thumbnail(maxsize)
        im.save(output_img_path, "JPEG", dpi=(300,300))
        print(f"processing file {input_img_path} done...")