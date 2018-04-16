FROM hello-world

# Set the working directory to /app
#WORKDIR /src

# Copy the current directory contents into the container at /app
COPY ./build/libs/*.jar /ops/libs/sol.jar

# Install any needed packages specified in requirements.txt
#RUN pip install --trusted-host pypi.python.org -r requirements.txt

# Make port 80 available to the world outside this container
EXPOSE 80

# Define environment variable
#ENV NAME World

# Run app.py when the container launches
CMD ["java", "-jar" "/ops/libs/sol.jar"]