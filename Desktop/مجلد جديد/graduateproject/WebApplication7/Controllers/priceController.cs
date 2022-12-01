using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace WebApplication7.Controllers
{
    public class priceController : ApiController
    {
        public IEnumerable<Price> Get()
        {
            using (ExpertSystemEntities entities = new ExpertSystemEntities())
            {
                return entities.Price.ToList();
            }
        }
    }
}
